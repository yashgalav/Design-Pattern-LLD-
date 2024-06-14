package main.designPattern.ProtoTypeDesignPattern;

public class main {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192:1:11:23");
        networkConnection.loadImportantData();
        networkConnection.loadDomain();


        System.out.println(networkConnection.getIp()+" : "+networkConnection.getData() +" : "+networkConnection.getDomain());
        // we new object network connection
        try{
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            networkConnection.getDomain().remove(0);
            System.out.println(networkConnection.getIp()+" : "+networkConnection.getData() +" : "+networkConnection.getDomain());
            System.out.println(networkConnection2.getIp()+" : "+networkConnection2.getData() +" : "+networkConnection2.getDomain());

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
