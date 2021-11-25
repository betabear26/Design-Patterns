class DoubleCheckLockSingleton{

    private static volatile DoubleCheckLockSingleton instance = null;

    //Private constrctor to stop instantiating the object from outside
    private DoubleCheckLockSingleton(){
        // Epmpty constructor. Write your own logic
    }

    public static DoubleCheckLockSingleton getInstance(){
        if(instance == null){
            synchronized(this){
                if(instance == null){
                    System.out.println("Empty Singleton. Instantiating a new instance")
                    instance = new DoubleCheckLockSingleton();
                }
            }           
        }

        return instance;
    }
}