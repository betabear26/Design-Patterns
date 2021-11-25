class MySingleton{

    private static MySingleton instance = null;

    private Singleton(){} //Private constrctor to stop instantiating the object

    public static MySingleton getInstance(){
        if(instance == null){
            System.out.println("Empty Singleton. Instantiating a new instance")
            instance = new Singleton();
        }

        return instance;
    }
}