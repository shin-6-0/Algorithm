import math,sys
arr=[1]*(10001)
m=math.floor(math.sqrt(10000))
for j in range(2,m+1):
    for k in range(j,10001,j):
        if j==k:
            continue
        else:
            arr[k]=0
                
t=int(sys.stdin.readline())
for i in range(t):
    a=0
    b=0
    n=int(sys.stdin.readline())
    pq=[]
    
    for p in range(2,n+1):
        q=n-p
        if arr[p]==1 and arr[q]==1:
            pq.append(p)
    middle_num=n//2
    minn=0
    if len(pq)>1:
        minn=abs(pq[0]-middle_num)
        for r in range(len(pq)):
            if minn>abs(pq[r]-middle_num):
                minn=abs(pq[r]-middle_num)
        a=middle_num-minn
        b=middle_num+minn
        print(a,b)
    else:
        print(p,n-p)
    