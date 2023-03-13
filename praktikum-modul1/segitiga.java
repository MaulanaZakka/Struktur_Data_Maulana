class Segitiga<N extends Number> {
    private N alas;
    private N tinggi;

    public Segitiga(N alas, N tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        return (int) (0.5 * alas.doubleValue() * tinggi.doubleValue());
    }

    public double getResultAsDouble() {
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }
}