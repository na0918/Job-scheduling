# Job-scheduling(202001631 나병운)
* 소스코드는 marster branch /src 안에있습니다.(최적해만 구하는 코드이기 때문에 손으로도 구현했습니다.)

## 작업 스케줄링
작업 스케줄링(Task Scheduling) 문제는 작업의 수행 시간이 중복되지 않도록 모든 작업을 가장 적은 수의 기계에 배정하는 알고리즘이다.


### 입력
```
작업의 개수(n) : 8
기계의 개수(m) : 2
if 작업시간의 랜덤값 [7 2 1 5 3 8 4 6]
```
### 근사 비율과 시간복잡도
![KakaoTalk_20210518_230013262](https://user-images.githubusercontent.com/80372995/118665041-f0071580-b82c-11eb-8b3b-c7352193c23e.jpg)


![KakaoTalk_20210518_223445404](https://user-images.githubusercontent.com/80372995/118664036-1bd5cb80-b82c-11eb-8991-1d056abe1843.jpg)

### 출력
```
OPT(최적해) : 22
OPT'(근사해) : 19
```
