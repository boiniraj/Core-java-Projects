package p1;
import java.util.*;
import java.io.*;
@SuppressWarnings("serial")
public class User extends Object implements Serializable
{
   
	public String uname, mid;
	 public Date dateTime;	 
   
public User(String uname,String mid,Date dateTime)
   {   
	 this.uname=uname;
	 this.mid=mid;
	 this.dateTime=dateTime; 
   }
    public String toString()
     {
	return"User-Name:"+uname+"\nmailId:"+mid+"\nRegDateTime:"+dateTime; 
     }
   }
