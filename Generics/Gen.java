class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    public T getob() {
        return ob;
    }

    public void showob() {
        System.out.println("name of the class is:" + ob.getClass().getName());
    }
}