class Pionek{
	ruch(int n, int m){
		if(m=2){
			show(n,m+1);
			show(n,m+2);
		}
		else{
			show(n,m+1);
		}
	}
}
class Krol{
	ruch(int n, int m){
		if(m==0){
			show(n,m+1);
			show(n+1,m+1);
			show(n-1,m+2);
			show(n+1,m);
			show(n-1,m);
		}
		else if(m==7){
			show(n+1,m);
			show(n-1,m);
			show(n,m-1);
			show(n-1,m-1);
			show(n+1,m-1);
		}
		else
			show(n+1,m);
			show(n-1,m);
			show(n,m-1);
			show(n-1,m-1);
			show(n+1,m-1);
			show(n,m+1);
			show(n+1,m+1);
			show(n-1,m+2);
	}
}
class Laufer{
	ruch(int n, int m){
		int i=1;
		while(n>=0&&m>=0&&n<8&&m<8){
			show(n-i,m-i);
			show(n+i;m+i);
			show(n-i,m+i);
			show(n+i,m-i);
			i++
		}
	}
}
class Wieza{
	ruch(int n, int m){
		int i=1;
		while(n>=0&&m>=0&&n<8&&m<8){
			show(n-i,m);
			show(n+i,m);
			show(n,m+i);
			show(n,m-i);
			i++
		}
	}
}
class Krolowa{
	ruch(int n, int m){
		int i=1;
		while(n>=0&&m>=0&&n<8&&m<8){
			show(n-i,m);
			show(n+i,m);
			show(n,m+i);
			show(n,m-i);
			show(n-i,m-i);
			show(n+i;m+i);
			show(n-i,m+i);
			show(n+i,m-i);
			i++
		}
	}
}
class Kon{
	ruch(int n, int m){
		if(m==0){
			show(n-2,m+1);
			show(n+2,m+1);
			show(n+1,m+2);
			show(n-1,m+2);
		}
		else if(m==1){
			show(n-2,m+1);
			show(n+2,m+1);
			show(n+1,m+2);
			show(n-1,m+2);
			show(n+2,m-1);
			show(n-2,m-1);
		}
		else if(m==6){
			show(n+2,m-1);
			show(n-2,m-1);
			show(n-2,m+1);
			show(n+2,m+1);
			show(n+1,m-2);
			show(n-1,m-2);
		}
		else if(m==7){
			show(n+2,m-1);
			show(n-2,m-1);
			show(n+1,m-2);
			show(n-1,m-2);
		}
		else{
			show(n-2,m+1);
			show(n+2,m+1);
			show(n+1,m+2);
			show(n-1,m+2);
			show(n+2,m-1);
			show(n-2,m-1);
			show(n+1,m-2);
			show(n-1,m-2);
		}
	}
}
