public class Stack<T> {

    private Object[] dati;
    private int n;

    public Stack() {
        dati = new Object[10];
        n = 0;
    }

    public void push(T valore) {
        if (n == dati.length) {
            Object[] nuovo = new Object[dati.length + 10];
            for (int i = 0; i < dati.length; i++)
                nuovo[i] = dati[i];
            dati = nuovo;
        }
        dati[n++] = valore;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) return null;
        T val = (T) dati[--n];
        return val;
    }

    @SuppressWarnings("unchecked")
    public T top() {
        if (isEmpty()) return null;
        return (T) dati[n - 1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }
}
