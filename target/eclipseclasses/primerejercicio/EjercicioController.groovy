package primerejercicio

class EjercicioController {
    def resultado = 15*20+10+4
    String mensaje = """
<h1>Bienvenidos a el ejercicio de suma</h1>
<h2>En este ejercicio se creara un html compuesto con lo siguiente:</h2>
<ul>
    <li>h1</li>
    <li>h2</li>
    <li>a</li>
    <li>p</li>
    <li>button</li>

</ul>
<a href=#>Este es un enlace de prueba</a>
<p>El resultado de la suma 15*20+10+4 =  $resultado</p>
<button>Dame Clic</button>
"""

    def index() {
        render  mensaje
    }
}
