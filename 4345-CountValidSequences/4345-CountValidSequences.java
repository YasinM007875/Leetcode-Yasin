// Last updated: 8/11/2026, 2:14:36 PM

class Solution {
    static final int MOD=1000000007;
    long modPow(long a,long b){
        long res=1;
    while(b>0){
        if((b&1)==1) res=res*a%MOD;
        a=a*a%MOD;
        b>>=1;
    }
        return res;
    }
    long nCr(int n,int r){
        if(r<0||r>n)return 0;
        long[] fact=new long[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++)
            fact[i]=fact[i-1]*i%MOD;

        long num=fact[n];
        long den=modPow(fact[r],MOD-2)*modPow(fact[n-r],MOD-2)%MOD;
        return num*den%MOD;
    }
    public int countValidSequences(int n, int k) {
        if(k>n) return 0;
        long total=nCr(n-1,k-1);
        if(((n-k)&1)==1)
            return (int) total;
        int m=(n-k)/2;
        long odd=nCr(m+k-1,k-1);
        long ans=(total-odd+MOD)%MOD;
        return (int) ans;
        
    }
}