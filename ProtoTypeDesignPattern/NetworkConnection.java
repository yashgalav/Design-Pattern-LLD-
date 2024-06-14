package main.designPattern.ProtoTypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String> domain = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void  loadImportantData(){
        this.data = "vvip data";
        // it will take 5 minutes
    }

    public void loadDomain() throws InterruptedException{
        domain.add("google");
        domain.add("yash");
        domain.add("test");
    }

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());
        for(String str : this.domain){
            networkConnection.getDomain().add(str);
        }
        return  networkConnection;
    }
}
