public class Division { // Declara una clase pública llamada Division
    private int n1, n2, res; // Declara tres variables enteras privadas: n1, n2 y res (resultado)

    // Método para realizar la división y devolver el resultado
    public int mostrarResultado() {
        res = n1 / n2; // Calcula la división de n1 entre n2 y almacena el resultado en res
        return res; // Devuelve el resultado de la división
    }

    // Métodos getter y setter para n1
    public int getN1() {
        return n1; // Devuelve el valor de n1
    }

    public void setN1(int n1) {
        this.n1 = n1; // Establece el valor de n1 utilizando el valor proporcionado
    }

    // Métodos getter y setter para n2
    public int getN2() {
        return n2; // Devuelve el valor de n2
    }

    public void setN2(int n2) {
        this.n2 = n2; // Establece el valor de n2 utilizando el valor proporcionado
    }

    // Métodos getter y setter para res (resultado)
    public int getRes() {
        return res; // Devuelve el resultado almacenado
    }

    public void setRes(int res) {
        this.res = res; // Establece el resultado utilizando el valor proporcionado
    }

    // Método toString para representar el objeto en forma de cadena
    @Override
    public String toString() {
        return "Division [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]"; // Devuelve una cadena representando el objeto
    }
}
