n=int(input())

def pattern(n):
    if n==3:
        return["***","* *","***"]
    low_n=pattern(n//3) #재귀함수 중 이전 패턴 의미
    new=[]
    for i in range(3):
        if i == 1:
            for j in range(len(low_n)):
                new.append(low_n[j]+' '*(n//3)+low_n[j])
        else:
            for j in range(len(low_n)):
                new.append(low_n[j]*3)
    return new
print('\n'.join(pattern(n)))

#파이썬의 join 함수
#"".join(a) 
#""사이에 문자를 지정하면 지정한 문자로 나뉘어진 '리스트의' 문자들을 연결해줌