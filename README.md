El supermercado *Ejemplo (“DeTodo SA”)* nos ha pedido crear una demo del módulo productos que permita:
dar de alta, bajas y modificar productos del establecimiento y una serie de consultas de dichos
productos por: **rubro, nombre y precios. De cada Producto, interesa conocer: código (numérico),
descripción, precio, stock y rubro (comestible, limpieza y perfumería son los únicos permitidos).**

Para dar solución a este requerimiento, lo haremos implementando un TreeSet de Productos, en
donde haremos que se ordenen por código a medida que se van ingresando.
