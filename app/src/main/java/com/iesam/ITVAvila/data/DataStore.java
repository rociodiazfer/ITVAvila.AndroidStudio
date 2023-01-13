package com.iesam.ITVAvila.data;

public class DataStore {
    public Integer size;
    private DataStore now;

    public DataStore(){

    }
    public DataStore (Integer size){
        this.size= size;
    }
    public Integer getSize(){
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }


}
