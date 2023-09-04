# Cola de Prioridad

Una cola de prioridad es un tipo de dato abstracto similar a una cola en la que los elementos tienen adicionalmente una prioridad asignada.
Los elementos de la cola se van desacolando según su prioridad.
Al igual que una cola común y corriente, las operaciones que se le pueden aplicar son insertar, eliminar y pispear (observar el próximo elemento a ser desacolado)

## Implementación en un Montículo

La implementación mediante un montículo binario de mínimo consigue una gran mejora en el rendimiento, con una complejidad computacional de O(log(n)) para inserciones y eliminaciones.