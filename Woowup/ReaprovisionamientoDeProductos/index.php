<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reaprovisionamiento de productos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <style>
            .error{
                color: red;
            }
        </style>
    </head>
    <body>
        <header class="container mt-5">
            <div class="row">
                <h1>Reaprovisionamiento de productos</h1>
                <form class="col-md-5 ml-3" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post">
                    <textarea  class="form-control mt-3 alert alert-info" autofocus name="json" cols="30" rows="15" value="hola"><?php if (isset($json)) {echo json_encode($json);} ?></textarea>
                    <button class="form-control mt-3 alert alert-primary" type="submit" name="calcular">calcular</button>
                    <?php
                        error_reporting(0);
                        //almacenamiento del json
                        if(isset($_POST['calcular'])){
                            $json = $_POST['json'];
                            $cliente = json_decode($json,true);
                            if($cliente == null){
                            echo "<p class='error mt-3 alert alert-danger'>El Json esta mal escrito</p>";
                            }
                            //declaro una nueva variable para almacenar las compras
                            $purchases;
                            foreach ($cliente as $product) {
                                $purchases = $product;
                            }
                            foreach ($purchases as $product) {
                                $purchases = $product;
                            }
                            //almaceno cada compra en un array
                            $compras = [];
                            for($i=0;$i<count($purchases) ;$i++){
                                foreach($purchases[$i] as $compra){
                                    $compras[$i] = $compra;
                                }
                            }
                        }
                    ?>
                </form>
                <div class="col-md-1">
                </div>
                <div class="float-right col-md-6">
                    <?php
                        /*declaro un array multidimencional para los productos, que almacen en
                            0     SKU
                            1     cantidad de veces comprado
                            2     array de fecha en la que se compro
                            3     nombre del producto
                        */
                        $productos = [
                            [],
                            [],
                            [],
                            [],
                            []
                        ];
                        //almacenamiento de datos de los productos
                        for($j = 0; $j <count($compras);$j++){
                            for($k = 0; $k<count($compras[$j]);$k++){
                                $l = false ;
                                for ($i=0; $i <count($productos); $i++) { 
                                    if(($k>0 || $j>0) && $productos[$i][0] == $compras[$j][$k]['sku'] && !$l){
                                        $l=true;
                                        $productos[$i][1]++;
                                    }else if($productos[$i][0] == null && !$l){
                                        $l=true;
                                        $productos[$i][0] = $compras[$j][$k]['sku'];
                                        $productos[$i][1]++;
                                        $productos[$i][3] = $compras[$j][$k]['name'];
                                    }
                                    if($productos[$i][0] == $purchases[$j]['products'][$k]['sku']){
                                        $productos[$i][2][$j] = $purchases[$j]['date'];
                                    }
                                }
                            }
                        }
                        //calculo de proxima fecha de compra de cada producto
                        $proximaCompra = [];
                        $fecha;
                        for($i = 0; $i<count($productos); $i++){
                            if($productos[$i][1]>=2){
                                for ($j= 0; $j < count($purchases)-1; $j++) { 
                                    if(isset($productos[$i][2][$j])){
                                        $detener = false; 
                                        for ($k=$j+1; $k < count($purchases) && !$detener; $k++) { 
                                            if(isset($productos[$i][2][$k])){
                                                $fecha = date('Y-m-d',strtotime($productos[$i][2][$k])-strtotime($productos[$i][2][$j])+strtotime($productos[$i][2][$k]));
                                                $detener = true;
                                            }
                                        }
                                    }
                                }
                                $proximaCompra[$i][0] = $fecha;
                                $proximaCompra[$i][1] = $productos[$i][0];
                            }
                        }
                        // impresion de la proxima fecha de compra de los productos mayores a 2
                        for($i=0;$i<count($purchases);$i++){
                            if(isset($proximaCompra[$i])){
                                echo '<div class="alert alert-success"> La Proxima compra de '.$productos[$i][3].' va hacer: <br>'.$proximaCompra[$i][0].'</div>';
                            }
                        }
                    ?>
                </div>
            </div>
        </header>
    </body>
</html>