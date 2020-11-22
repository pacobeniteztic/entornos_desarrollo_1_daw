¡Tu compañer@ ha diseñado un programa en Java para generar claves secretas!

Está muy ilusionad@ porque genera claves aleatorias con vocales, consonantes y números, aunque está algo preocupado porque no sabe si el programa pasa los tests de JUnit ... ¡necesita de tu ayuda!

Su proyecto está formado por:

1. El código fuente (src/main/java): &quot;GeneradorClaves&quot;.
2. El código de tests (src/test/java): &quot;GeneradorClavesTest&quot;.


El código de tests tiene un primer método implementado por el compañer@, ¡pero le faltan muchos más!

Este primer método, para que tengas una idea, acaba haciendo una llamada a:

generadorClaves.lanzarProceso(&quot;5&quot;, &quot;4&quot;, &quot;3&quot;);

Este método generará una clave secreta con los siguientes parámetros:

1. Vocales (ejemplo &quot;5&quot;): número de vocales que tendrá tu clave secreta.
2. Consonantes (ejemplo &quot;4&quot;): número de consonantes que tendrá tu clave secreta.
3. Números (ejemplo &quot;3&quot;): los números que tendrá tu clave secreta.

Cuando hagas un &quot;Run&quot; de la clase de tests, te pintará por &quot;Console&quot; algo parecido a esto: **La clave generada es ... oieaindmp109

Si te fijas, hay 5 vocales generadas aleatoriamente, 4 consonantes y 3 números.

Tareas a realizar:

- Queremos hacer una prueba de &quot;cubrimiento&quot;. ¿Podrías saber cuántas líneas de código están cubiertas? **Recuerda** : en Eclipse teníamos que usar la opción &quot;Coverage as...&quot; sobre nuestra clase de test para saber cuántas líneas en verde hay cubiertas en nuestro código fuente.


Escribe aquí las líneas de código cubiertas: \_\_\_\_\_\_\_\_

Deja pantallazo de cómo queda la clase sombreada en verde, amarillo y rojo.

Deja pantallazo de la pestaña &quot;Coverage&quot;. Como verás, nos dirá el porcentaje de código cubierto.

- ¿Quedan líneas sin cubrir? En caso afirmativo, crea nuevos métodos de tests que consigan pasar por las líneas que están en amarillo y rojo.

- ¿Qué tipo de pruebas hemos hecho en el apartado anterior? ¿condiciones, bucles, etcétera?

- Crea nuevos métodos de tests para hacer pruebas de tipo &quot;bucles&quot;. ¿Serás capaz de encontrar algún bug en el bucle? Razona tu respuesta.

- ¿Se pueden hacer métodos de tests de &quot;Clases de equivalencia de datos&quot;? En caso afirmativo créalos y pruébalos en el código de tests.

- ¿Se pueden hacer pruebas sobre este código de &quot;Valores límite&quot;? En caso afirmativo créalos y pruébalos en el código de tests. **Recuerda** : los valores límite de los enteros son -2147483648 (mínimo) y 2147483647 (máximo).

La entrega en Classroom será un ZIP con:

1. Documento en Word o PDF con todas estas preguntas respondidas.
2. Un ZIP con tu proyecto JAVA con los cambios realizados en la clase de tests.

IMPORTANTE, ¡sólo tienes que cambiar el código de la clase GeneradorClavesTest! ¡no debes cambiar la clase GeneradorClaves!