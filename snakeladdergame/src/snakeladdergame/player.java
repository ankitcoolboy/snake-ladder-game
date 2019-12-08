package snakeladdergame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.*;
import java.util.Random;
import java.util.Scanner;


 class SnakebiteException extends Exception{
	public SnakebiteException(String message){
		super(message);
	}
	
}
 class CricketBiteException extends Exception{
	 public CricketBiteException(String message){
			super(message);
		}
 }

 
 
 class VultureBiteException extends Exception{
	public VultureBiteException(String message){
		super(message);
	}
 }
  
 
 class TrampolinebiteException extends Exception{
	 public TrampolinebiteException(String message){
		 super(message);
		 
	 }
 }
 
 class whitetileException extends Exception{
	 public whitetileException(String message){
		 super(message);
	 }
 }
 
 class GamewinnerException extends Exception{
	 public GamewinnerException(String message){
		 super(message);
	 }
 }
 
 class rightinputExcepiton extends Exception{
	 public rightinputExcepiton(String message) {
		 super(message);
		 
	 }
 }
 class inputlessException extends Exception{
	 public inputlessException (String message) {
		 super(message);
	 }
 }
 /*class InputMismatchException extends Exception{
	 public InputMismatchException(String message){
		 super(message);
	 }
	 
 }
*/
 
 
 
class data implements Serializable{
	private ArrayList<Integer> list_map=new ArrayList<Integer>();
	private int y;
	private int e;
	private int f;
	private int g;
	private int h;
	private int tile;
	private int roll;
	private int sncount;
	private int vlcount;
	private int crcount;
	private int trcount;
	
	public data(int y,int e,int f, int g,int h,int roll,int tile,ArrayList<Integer> list_map,int sncount,int vlcount,int crcount,int trcount) {
		this.y=y;
		this.e=e;
		this.g=g;
		this.h=h;
		this.f=f;
		this.list_map=list_map;
		this.roll=roll;
		this.tile=tile;
		this.crcount=crcount;
		this.sncount=sncount;
		this.vlcount=vlcount;
		this.trcount=trcount;
		
	}
	public ArrayList<Integer> getList_map() {
		return list_map;
	}
	public int getY() {
		return y;
	}
	public int getE() {
		return e;
	}
	public int getF() {
		return f;
	}
	public int getG() {
		return g;
	}
	public int getH() {
		return h;
	}
	public int getTile() {
		return tile;
	}
	public int getRoll() {
		return roll;
	}
	public int getSncount() {
		return sncount;
	}
	public int getVlcount() {
		return vlcount;
	}
	public int getCrcount() {
		return crcount;
	}
	public int getTrcount() {
		return trcount;
	}

}
class map{
	private int y;
	private int a;
	private int b;
	private int c;
	private int d;
	
	
	
	
	
	public map(int y,int a,int b,int c,int d){
		this.y=y;	
		this.a=y;
		this.b=y;
		this.c=y;
		this.d=d;
		
	}
	
	
	private static int random(int min, int max) {

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	private ArrayList<Integer> list_map=new ArrayList<Integer>(y);
	
	public void mapper(){
		
		Random rand = new Random();
		
		
		if(y>0){
		
		for(int i=0;i<y;i++){
			list_map.add(7);
		}
		
		
		
		for(int j=0;j<a;j++){
			int r =rand.nextInt(y-2)+2;
			list_map.set(r,0);
		
		
		}
		for(int k=0;k<b;k++){
			int r =rand.nextInt(y-2)+2;
			list_map.set(r,1);
			
		}
		for(int l=0;l<c;l++){
			int r =rand.nextInt(y-2)+2;
			list_map.set(r,2);
			
		}
		for(int u=0;u<d;u++){
			int r =rand.nextInt(y-2)+2;
			list_map.set(r,3);
			
		}
		}
		int k=0;
		
		int counter=0;
		
		for(int w=0;w<list_map.size();w++){
			k++;
			
			
			if(list_map.get(w)==7){
				counter++;
				
				
			}
			if(w>4){
			
			if(k==6){
				
				if(counter<5){
					for(int i=0;i<5;i++){
					int c=random(w-5,w-1);
				
					list_map.set(c,7);
					
				}
					counter=0;
					}
				
				k=0;
				
			}
			
		}
	}
	}
	
	
	
	
	public ArrayList<Integer> getList_map() {
		return list_map;
	}
	
	
	
}



abstract class tile{
 	
	public abstract int attack(int tiles);
	
}


class snake extends tile{
	private final int moves;
	public snake(int move){
		this.moves=move;
	}
	
	
	@Override
	public int attack(int tiles) {
		// TODO Auto-generated method stub
		tiles-=moves;
		return tiles;
	}
	
}


class cricket extends tile{
	private final int move;
	public cricket(int move){
		this.move=move;
		
	}
	@Override
	public int attack(int tiles) {
		// TODO Auto-generated method stub
		tiles-=move;
		return tiles;
	}
}


class vultures extends tile{
	private final int move;
	public vultures(int move){
		this.move=move;
	}
	@Override
	public int attack(int tiles) {
		// TODO Auto-generated method stub
		tiles-=move;
		return tiles;
	}
	
	
	
}


class trampoline extends tile{
	private final int move;
	public trampoline (int moves){
		this.move=moves;
	}
	@Override
	public int attack(int tiles) {
		// TODO Auto-generated method stub
		tiles+=move;
		return tiles;
	}
	
	
}







public class player implements Serializable {

	/**
	 * @param args
	 */
	public static void snake(int m) throws SnakebiteException {
		throw new SnakebiteException("hiis i am sanke");
		
	}
	public static void cricket(int m) throws CricketBiteException{
		throw new CricketBiteException("chirp i am a cricket");
	}
	public static void vulture(int m) throws VultureBiteException{
		throw new VultureBiteException(">> >> Yapping...! I am a Vulture");
		
	}
	public static void Trampoline(int m)throws TrampolinebiteException{
		throw new TrampolinebiteException(">> >> PingPong! I am a Trampoline, you advance ");
		
	}
	public static void gamewinner(int m) throws GamewinnerException {
		throw new GamewinnerException(">> >> winner winner chicken dinner");
		
	}
	public static void serialize(int y,int e,int f,int g,int h,int roll, int tile,ArrayList<Integer> list_map,String k,int sncount, int vlcount,int crcount,int trcount,int hj) throws IOException {
		
		data d=new data(y,e,f,g,h,roll,tile,list_map,sncount,vlcount,crcount,trcount);
		k=k+".txt";
		System.out.print("saved in "+k);
		
		ObjectOutputStream out = null;
		 try {
		 out = new ObjectOutputStream (
		 new FileOutputStream(k));
		 out.writeObject(d);
		 } finally {
		 out.close();
		 }
		
		 
		 
	}

	public static data deserialize(String k) throws IOException, ClassNotFoundException {
	ObjectInputStream in = null;
	data d=null;
	k=k+".txt";
	 try {
	 in = new ObjectInputStream (new FileInputStream(k));
	 data s1 = (data) in.readObject();
	 d=s1;
	 } finally {
	 in.close();
	 }
	return d;
	 }
	
	
	
	
	
	public static void snakebite(int m){
		try {
		throw new SnakebiteException(">> Hiss...! I am a Snake, you go back "+m+" tiles!");
		
		}
		catch(SnakebiteException k){
			System.out.print(k.getMessage());
		}
		
	}
	public static void cricketbite(int m) {
		try {
			throw new CricketBiteException(">> Chirp...! I am a Cricket, you go back "+m+" tiles!");
			
		}
		catch(CricketBiteException k){
			System.out.print(k.getMessage());
		}
		
	}
	public static void vulturebite(int m) {
		try {
			throw new VultureBiteException(">> >> Yapping...! I am a Vulture, you go back	 "+m+" tiles!");
			
		}
		catch(VultureBiteException k){
			System.out.print(k.getMessage());
		}
		
	}
	public static void trampolinebite(int m) {
		try {
			throw new TrampolinebiteException(">> >> PingPong! I am a Trampoline, you advance "+m+" tiles!");
			
		}
		catch(TrampolinebiteException k){
			System.out.print(k.getMessage());
		}
		
	}
	
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		BufferedReader in = null;
		PrintWriter out = null;
		ArrayList<String> character=new ArrayList<String>();
		character.add("snake");
		character.add("cricket");
		character.add("vultures");
		character.add("trampoline");
		
		Scanner s1=new Scanner(System.in);
		Random rand = new Random();
		System.out.print("1 new user");
		System.out.print("2 existing user");
		int input1=0;
		
		boolean started=false;
		while(!started){
		try{
			int input= s1.nextInt();
			
			if(input==1||input==2){
				started =true;
				input1=input;
			}
			else{
				throw new InputMismatchException();
			}
			}
			catch(InputMismatchException inp){
				System.out.println("Wrong input:");
				System.out.println("Try again input 1  or 2 to move ahead");
				s1.nextLine();
			}
		}
		
		int y=0;
		int hj=0;
		int df=0;
		
		if(input1==1) {
		System.out.println(">>Enter total number of tiles on the race track (length)");
		boolean abc=false;
		while(!abc){
		try {
			
		int num = s1.nextInt(); //exception point
		y=num;
		if(y<3) {
			throw new inputlessException("enter a number greater than 2") ;
				
			
		}
		abc=true;
		
		}
		catch(InputMismatchException inp) {
		System.out.println("not a valid input");
		System.out.println("input a integer,try again!");
		s1.nextLine();
		}
		catch(inputlessException less) {
			System.out.println(less.getMessage());
			s1.nextLine();
		}
		 }
	}
		
		int fg=(int) ((int) y*0.25);
		int tf=(int) ((int) y*0.5);
		int tg=(int) ((int) y*0.75);
		
		int a =rand.nextInt((int) (10))+1;
		int b=rand.nextInt((int) (10))+1;
		int c=rand.nextInt((int) (10))+1;
		int d=rand.nextInt((int) (10))+1;
		
		map obj=new map(y,a,b,c,d);
		obj.mapper();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list=obj.getList_map();
		if(input1==1) {
		System.out.println(">>Setting up the race track...");
		System.out.println(">>Danger: There are "+a+" "+b+" "+c +" numbers of Snakes, Cricket, and Vultures respectively on your track! //");
		}
		int e =rand.nextInt(10)+1;
		tile sn=new snake(e);
		int f=rand.nextInt(10)+1;
		tile cr=new cricket(f);
		int g=rand.nextInt(10)+1;
		tile vl=new vultures(g);
		int h=rand.nextInt(10)+1;
		tile tr=new trampoline(h);
		if(input1==1) {
		System.out.println(">>Danger: Each Snake, Cricket, and Vultures can throw you back by "+e+" "+ f+" "+ g+" number of Tiles respectively!");

		System.out.println(">>Good News: There are "+d+" number of Trampolines on your track!");
		System.out.println(">>Good News: Each Trampoline can help you advance by"+d+" number of Tiles");
		}
		 
		System.out.println(">>Enter the Player Name");
		int u=0;
		String name=null;
		if(input1==1) {
		name=s1.next();
		}
		int check=0;
		boolean check1=true;
		if(input1==2) {
		
		while(check1) {
		try {
			in = new BufferedReader(new FileReader("output.txt"));
			String q;
			name=s1.next();
			while ((q = in.readLine()) != null){ 
				if(q.matches(name)) {
				System.out.println("player already existing");
				check=1;
				check1=false;
				
				}
			}
			
			if(check!=1) {
				throw new rightinputExcepiton("user doesn't exit please enter correct name");
			}
		}
		catch(rightinputExcepiton k) {
			System.out.print(k.getMessage());
			
			
		}
		
		finally {
			if (in != null)
				in.close();
			s1.nextLine();
		}
		}
		}
		
		if(input1==1) {
		
		try {
			out = new PrintWriter( new FileWriter("output.txt",true));
			String l=name;
			out.println(l);
		}
		finally {
			if (out != null) 
			out.close(); 
							
			 }
		
		}
		if(input1==1) {
		System.out.println(">>Starting the game with "+ name+" at Tile-1");
		}
		else {
			System.out.println(">>Starting the game with "+ name);
		}
		System.out.println(">>Control transferred to Computer for rolling the Dice for "+name);
		System.out.println(">>Hit 1 to start the game");
		boolean start=false;
		while(!start){
		try{
		int q=s1.nextInt();
		
		if(q==1){
			 start=true;
		}
		else{
			throw new InputMismatchException();
		}
		}
		catch(InputMismatchException inp){
			System.out.println("Wrong input:");
			System.out.println("Try again.input 1 to start");
			s1.nextLine();
		}
	}
		System.out.println(">>Game Started ======================>");
		int tile=1;
		boolean game=true;
		boolean path=false;
		int roll=1;
		int sncount=0;
		int vlcount=0;
		int crcount=0;
		int trcount=0;
		data gj=null;
		if(input1==2) {
			gj=deserialize(name);
			y=gj.getY();
			sncount=gj.getSncount();
			vlcount=gj.getVlcount();
			crcount=gj.getCrcount();
			trcount=gj.getTrcount();
			roll=gj.getRoll();
			list=gj.getList_map();
			tile=gj.getTile();
			e=gj.getE();
			g=gj.getG();
			h=gj.getH();
			f=gj.getF();
			tile n=new snake(e);
			sn=n;
			tile r=new cricket(f);
			cr=r;
			tile l=new vultures(g);
			vl=l;
			tile rr=new trampoline(h);
			tr=rr;
			
			fg=(int) ((int) y*0.25);
			tf=(int) ((int) y*0.5);
			tg=(int) ((int) y*0.75);
			
		}
	
		
		while(game && start){
			int l=rand.nextInt(6)+1;
			roll ++;
			
			if(tile<=0){
				path=false;
				tile=1;
				
			}
			
		
			if(tile>=y){
				System.out.println("winneer");
				path=false;
				
			}
			
			if(tile>=tg && tile<=(tg+4)) {
				if(df==0) {
				df=1;
				System.out.println("1:continue the game");
				System.out.println("2:save and exit the game");
				int hg=0;
				int fgh=0;
				boolean starting=false;
				while(!starting){
				try{
					int t= s1.nextInt();
					hg=t;
					if(t==1||t==2){
						starting =true;
					}
					else{
						throw new InputMismatchException();
					}
					}
					catch(InputMismatchException inp){
						System.out.println("Wrong input:");
						System.out.println("Try again input 1  or 2 to move ahead");
						s1.nextLine();
					}
				}
				if(hg==2) {
					
					serialize(y,e,f,g,h,(roll-1),tile,list,name,sncount,vlcount,crcount,trcount,fgh);
					path=false;
					System.exit(0);
				}
			}}
			else if(tile>=tf) {
				if(hj==0) {
					int dfg=0;
				hj=1;
				System.out.println("1:continue the game");
				System.out.println("2:save and exit the game");
				int hg=0;
			
				boolean starting=false;
				while(!starting){
				try{
					int t= s1.nextInt();
					hg=t;
					if(t==1||t==2){
						starting =true;
					}
					else{
						throw new InputMismatchException();
					}
					}
					catch(InputMismatchException inp){
						System.out.println("Wrong input:");
						System.out.println("Try again input 1  or 2 to move ahead");
						s1.nextLine();
					}
				}
				if(hg==2) {
					
					serialize(y,e,f,g,h,(roll-1),tile,list,name,sncount,vlcount,crcount,trcount,dfg);
					path=false;
					System.exit(0);
				}
			}}
			
			else if (tile>=fg) {
				if(u==0) {
				int lfg=1;
				u=1;
				System.out.println("1:continue the game");
				System.out.println("2:save and exit the game");
				int hg=0;
			
				boolean starting=false;
				while(!starting){
				try{
					int t= s1.nextInt();
					hg=t;
					if(t==1||t==2){
						starting =true;
					}
					else{
						throw new InputMismatchException();
					}
					}
					catch(InputMismatchException inp){
						System.out.println("Wrong input:");
						System.out.println("Try again input 1  or 2 to move ahead");
						s1.nextLine();
					}
				}
				if(hg==2) {
					
					serialize(y,e,f,g,h,(roll-1),tile,list,name,sncount,vlcount,crcount,trcount,lfg);
					path=false;
					System.exit(0);
				}
			}}
			
			
			if(tile==1){
				if(l==6){
				path=true;
				System.out.println(">>[Roll-"+roll+"]:"+name+" rolled "+l+" at Tile-1, You are out of the cage! You get a free roll.");
				}
				else{
					System.out.println(">>[Roll-"+roll+"]: "+ name+" Josh rolled "+l+" at Tile-1, OOPs you need 6 to start");
				}
			
				
			}
			if(input1==2) {
				path=true;
			}
			
			if(path==true){
				int r=rand.nextInt(6)+1;
				int z=tile;
				tile+=r;
			
				System.out.println(">>[Roll-"+roll+"]:" + name+" rolled "+r+" at Tile-"+z+", landed on Tile "+tile+".");
				try{
				if(tile>=y){
					
					path=false;
					
					throw new GamewinnerException ("you won the match");
				}
				}
				catch(GamewinnerException k){
					System.out.print(k.getMessage());
				}
				if(tile>=y){
					break;
				}
				
				System.out.println("Trying to shake the Tile-"+tile);
				try{
				if(list.get(tile)==0){
					sncount++;
					int x=sn.attack(tile);
					int m=tile-x;
					tile=x;
					snakebite(m);
				
				}
				else if(list.get(tile)==1){
					crcount++;
					int x=cr.attack(tile);
					int m=tile-x;
					tile=x;
					cricketbite(m);
					
					
				}
				else if(list.get(tile)==2){
					vlcount++;
					int x=vl.attack(tile);
					int m=tile-x;
					tile=x;
					vulturebite(m);
					
					
				}
				else if(list.get(tile)==3){
					trcount++;
					int x= tr.attack(tile);
					int m=x-tile;
					tile=x;
					trampolinebite(m);
					
				}
				else{
					System.out.println(">>  i am a white tile");
					
					
					
				}
				}
				
				finally{
					
					System.out.println(name+" moved to Tile "+tile);
				 }
				
				
				
			}
			
		}
		System.out.println(" ");
		System.out.println(">> "+name+" wins the race in "+roll+" rolls");
		System.out.println(">> Total Snake Bites ="+sncount);
		System.out.println(">> Total Vulture Bites ="+vlcount);
		System.out.println(">> Total Cricket Bites ="+crcount);
		System.out.println(">> Total Trampolines ="+trcount);

		
		
		
	}

	
}












