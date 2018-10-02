/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package asis;

import java.io.Serializable;

/**
 *
 * @author SANJAYA
 */
public class Mahasiswa implements Serializable {
    private String nim, nama, asal, kelas;

  public Mahasiswa( String nim, String nama, String asal, String kelas){
    this.nim=nim;
    this.nama=nama;
    this.asal=asal;
    this.kelas=kelas;
  }
  public String getNama(){
  return nama;
  }

  public String getNim(){
  return nim;
  }

  public String getAsal(){
  return asal;
  }

  public String getKelas(){
  return kelas;
  }

  public void setKelas(String kelas){
  this.kelas=kelas;
  }

  public void setNama(String nama){
  this.nama=nama;
  }

  public void setNim(String nim){
  this.nim=nim;
  }
  public void setAsal(String asal){
  this.asal=asal;
  }

    @Override
  public String toString(){
      return "\n1. Nim\t  ="+nim+"\n2. Nama\t ="+nama+"\n3. Asal\t ="+asal+"\n4. Kelas\t="+kelas;
  }
}
