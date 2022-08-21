package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HelloWorld {

    public static class Member implements Serializable {
        transient int id; // This will not serialized.
        String name;
        // constructor
        public Member(int i, String k) {
            this.id = i;
            this.name = k;
        }
    }

    public static void main(String args[]) throws Exception {
        Member temp =new Member( 2, "Clausia");//creating object
        //writing temp object into file
        FileOutputStream fread=new FileOutputStream("member.txt");
        ObjectOutputStream fout=new ObjectOutputStream(fread);
        fout.writeObject(temp);
        fout.flush();

        fout.close();
        fread.close();
        System.out.println("Data successfully saved in a file");
        
        // retrieving the data from file.
        ObjectInputStream fin=new ObjectInputStream(new FileInputStream("member.txt"));
        Member membr=(Member)fin.readObject();
        System.out.println(membr.id+" "+membr.name+" ");
        fin.close();
    }
}