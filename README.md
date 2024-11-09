# jVenTasas
Es una librería de Java la cual utiliza el metodo de web scrapping para consultar las tasas de referencia de las diferentes monedas en la pagina del Banco Central de Venezuela.

# Metodos
| Metodo | Acción |
| ----  | ---- |
| obtenerDolar() | Retorna una variable del tipo Double con el valor del dolar |
| obtenerEuro() | Retorna una variable del tipo Double con el valor del euro |
| obtenerYuan() | Retorna una variable del tipo Double con el valor del yuan |
| obtenerLira() | Retorna una variable del tipo Double con el valor de la lira |
| obtenerRublo() | Retorna una variable del tipo Double con el valor del rublo |

# Requisitos
- Requiere de la libreria [JSoup](https://jsoup.org/) para funcionar. 

# Como usar
- Incluir la libreria JSoup en su proyecto.
- Incluir la libreria jVenTasas en su proyecto.
- Importar los metodos de la libreria en su clase con el siguiente codigo: `import com.script_tasas.*;`
- Al ejecutar los metodos, asegurese que estos estan siendo llamados para almacenarse en una variable o mostrarse directamente.

# Como compilar
Esta libreria es un proyecto desarrollado con Apache Netbeans 22, el codigo puede ser editado y compilado con este IDE.
