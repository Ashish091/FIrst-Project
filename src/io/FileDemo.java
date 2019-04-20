package io;
import java.io.*;

class FileDemo
{
public static void main(String[] args)throws IOException
{
File f=new File("E:\\Java_Practice\\Core Java\\bin\\cricket.txt");
System.out.println(f.exists());//false
f.createNewFile();
System.out.println(f.exists());//true
}
}