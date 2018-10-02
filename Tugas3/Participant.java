/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package asis;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class Participant implements Serializable{
    public void serialize(List<Mahasiswa> pList, String fileName) {
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("participantData.ser"));
            out.writeObject(pList);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Participant> deserialize(String fileName){
        List<Participant> pList=null;
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("participantData.ser"));
            pList=(List<Participant>)in.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return pList;
    }
}
