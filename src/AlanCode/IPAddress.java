package AlanCode;

import java.util.List;
import java.util.Stack;

/*
Given an IP address, determine whether it is valid or invalid.

IP Address, can be IPv4 or IPv6
*/
public class IPAddress {

    public boolean validIPAddress(String ip) {
        String[] ips = ip.split("\\.");
        if(ip.charAt(ip.length()-1) == '.' || ip.charAt(0) == '.')
            return false;

        for(int i = 0; i< 4; i++){
            if(ips[i].isEmpty())
                return false;
            if(Integer.valueOf(ips[i])  <0 || Integer.valueOf(ips[i])> 255)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IPAddress ip = new IPAddress();
        System.out.println(ip.validIPAddress(".1.1.1"));

        System.out.println(ip.validIPAddress("1.1.1."));
        System.out.println(ip.validIPAddress("255.1.1.2"));
        System.out.println(ip.validIPAddress("1.1.-1.0"));
        System.out.println(ip.validIPAddress("0.1.1.255"));
        System.out.println(ip.validIPAddress("1.1.1.299"));




    }
}
