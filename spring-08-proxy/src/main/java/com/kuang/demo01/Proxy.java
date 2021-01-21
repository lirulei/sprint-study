package com.kuang.demo01;

/***
 * 代理模式好处： 可以使真实角色的操作更加纯粹，不用去关心一些公共的业务。公共业务发生扩展时，方便集中管理
 * 代理模式缺点： 一个真实角色就会产生一个代理角色。会导致代码量增加。
 */

public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房！！");
    }

    // 收中介费
    public void hetong() {
        System.out.println("签租赁合同！！");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费！！");
    }

}
