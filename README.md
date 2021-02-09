# WoowUp_IgnacioRobledo

La carpeta contiene los 2 ejercicios pedidos, separados cada uno en su respectiva carpeta.

  Subir la escalera:
    Fue desarrollado en el entorno de desarrollo de eclipse y con lenguaje java.
    Contiene el código de las combinaciones y las pruebas unitarias.
    El código calcula las combinaciones posibles a través de la fórmula de Fibonacci.
    Además de calcular cuales son las combinaciones posibles y las almacena en un array de tipo String.
      Cuáles son las combinaciones posibles se calcula:
      -creando un array de Int de la cantidad de escalones.
      -almacena la primera combinación (en la que todos son 1 escalón).
      -luego se itera en un for por la cantidad de 2 máximo que podría haber.
      -se calcula los escalones restantes (siendo los escalones que son diferentes de 0).
      -cuando se le suma un 2 al array el último elemento se convierte de 1 a 0, para que cuando se vuelva a calcular los escalones restantes se disminuye en uno.
			-se crea una variable q almacene la posición de los 2 que tiene el tamaño de la cantidad de 2
      -se inicia un do while para ver si hay más combinaciones con la cantidad de 2 y si es así se suma un 1 a vueltas.
      -se inicializan los escalones con 1
      -se agregan los 0 a los escalones
      -se calcula el ultimo 2
      -se cargan los 2 restantes
      -se pone en un for la obtención de repuesta en el cual se mueve el ultimo 2 hasta el último escalón restante
      -se obtiene si es necesario omitir la vuelta en base a los movimientos del ultimo 2 cargado, ósea seria el 2 más cercano al principio del array de escalones
     
  Reaprovisionamiento de productos:
    Este código fue desarrollado en entorno de desarrollo de Visual Studio Code en PHP.
    contiene un HTML conectado con Bootstrap
    -el código lee del Textarea el archivo Json y si es un Json empieza el cálculo de fechas, caso contrario manda un mensaje debajo con error en el formato.
    -almacena el Json en una variable, todas las compras en otra y luego cada compra, en una última variable, en array.
    -luego se crea una variable multidimensional con los productos que almacenara en:
          0     SKU
          1     cantidad de veces comprado
          2     array de fecha en la que se compro
          3     nombre del producto
    -cargo los datos de los productos.
    -creo una variable próxima compra que almacenara en:
          0     fecha
          1     SKU
    -obtengo cuales son los productos mayores a 2 con su posible fecha y se almacenan en próxima compra.
    -por último imprime en el HTML las fechas de los productos.
