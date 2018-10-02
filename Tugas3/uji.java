/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package asis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANJAYA
 */
public class uji  {
    public static void main(String[] args) {
        Participant demo = new Participant();
        ArrayList<Mahasiswa> participants = new ArrayList<Mahasiswa>();
        Scanner input = new Scanner(System.in);
        
        String nama1, nim1, jawab, asal1, kelas1 = "";
        String crname=null;
        do {
            System.out.println("pilih salah satu : insert, update, delete, exit");
            jawab = input.next();
            if (jawab.equalsIgnoreCase("insert")) {
                System.out.println("");
                System.out.println("masukkan nim");
                nim1 = input.next();
                System.out.println("masukkan nama");
                nama1 = input.next();
                System.out.println("masukkan asal");
                asal1 = input.next();
                System.out.println("masukkan kelas");
                kelas1 = input.next();
                Mahasiswa baru=new Mahasiswa(nim1, nama1, asal1, kelas1);
                participants.add(baru);
                System.out.println("Tambah " + baru.toString());
                System.out.println("");
            } else if (jawab.equalsIgnoreCase("update")) {
                System.out.println("");
                System.out.println("masukkan nama");
                crname = input.next();
                for (Mahasiswa i : participants) {
                    if (i.getNama().equalsIgnoreCase(crname)) {
                        System.out.println("DATA dari " + crname+" Adalah :");
                        System.out.println("nim : " + i.getNim());
                        System.out.println("nama : " + i.getNama());
                        System.out.println("asal :" + i.getAsal());
                        System.out.println("kelas :" + i.getKelas());
                        System.out.println("");
                        System.out.println("update nim");
                        nim1 = input.next();
                        System.out.println("update nama");
                        nama1 = input.next();
                        System.out.println("update asal");
                        asal1 = input.next();
                        System.out.println("update kelas");
                        kelas1 = input.next();
                        i.setNim(nim1);
                        i.setNama(nama1);
                        i.setAsal(asal1);
                        i.setKelas(kelas1);
                        System.out.println("Update " +crname+" menjadi "+ i.toString());
                    }else{System.out.println("tidak ditemukan");
                    break;}
                }
                System.out.println("");
            } else if (jawab.equalsIgnoreCase("delete")) {
                System.out.println("");
                System.out.println("masukkan data yang akan dihapus dengan nama");
                crname = input.next();
                for (Mahasiswa i : participants) {
                    if (i.getNama().equalsIgnoreCase(crname)) {
                        participants.remove(i);
                        System.out.println("participant "+i+" telah dihapus");
                        System.out.println("Participants : " + participants.toString());
                        System.out.println("");
                    }else{System.out.println("tidak ditemukan");break;}
                }
            }
        } while (!jawab.equalsIgnoreCase("exit"));
        System.out.println("print objek?");
        jawab=input.next();
        if (jawab.equalsIgnoreCase("ya")) {
            System.out.println("Participants : " + participants.toString());
        }
        System.out.println("save data?");
        jawab=input.next();
        if (jawab.equalsIgnoreCase("ya")) {
            demo.serialize(participants, "participantData.ser");
            System.out.println("silahkan buka file participantData.ser :)");

        }

//                         
//        participants.add(new Participant("Dee", "aja", 22));
//        participants.add(new Participant("Ami", "Fahmi", 22));
//        participants.add(new Participant("Haya", "Hayati", 22));
//        participants.add(new Participant("Aya", "Hayati", 22));

 //       demo.serialize(participants, "participantData.ser");
  //      System.out.println("Participants : " + participants.toString());
 //       System.out.println("serialisasi selesai");
  //      System.out.println("deserialisasi objek...");
 //       List<Participant> newList = demo.deserialize("participantData.ser");
 //       System.out.println("New List: " + newList);

    }
}
