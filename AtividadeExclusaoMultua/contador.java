class Contador{
    private Integer value;

    public Contador(Integer value){
        this.value = value;
    }

    public void increment(){
        this.value ++;
    }

    public Integer getValue(){
        return this.value;
    }
}