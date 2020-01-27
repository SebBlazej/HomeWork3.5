class Televisor {
    private boolean status = false;

    void turnOn(){
        status = true;
    }

    void turnOff(){
        status = false;
    }

    void showStatus(){
        System.out.println("Televisor is - " + (status?"on":"off"));
    }
}
