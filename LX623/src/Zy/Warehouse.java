package Zy;

public  class Warehouse <E> {

    private E[] wh;

    public void add(E[] wh){
        this.wh=wh;
    }

    public void shuchu(){
        for (E e:wh) {
            System.out.println(e);
        }
    }

}
