package com.kuang.demo01;


public class Client {
    public static void main(String[] args) {

        // 房东要租房子
        Host host = new Host();
//        host.rent();   这是传统的模式

        // 下面是代理模式、中介帮房东对外出租房子，但是中介会有些附加操作
        Proxy proxy = new Proxy(host);

        // 你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
