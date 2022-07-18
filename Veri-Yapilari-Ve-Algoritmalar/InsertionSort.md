# Insertion Sort Projesi



## Proje 1

### *[22,27,16,2,18,6]* -> Insertion Sort



 	1. Yukarıda verilen dizinin sort türüne göre aşamalarını yazınır.
 	2. Big-O gösterimini yazınız.
 	3. Time Complexity:
 	
 	 * Average case: Aradığımız sayının ortada olması
 	 * Worst case: Aradığımız sayının sonda olması
 	 * Best case: Aradığımız sayının dizinin en başında olması
 	
 	4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.



### Cevap



###### 1. *[22,27,16,2,18,6]* dizisinin Insertion Sort'a göre aşamaları

```
   1. [>22,27,16,2,18,6]

   2. [2,>27,16,22,18,6]

   3. [2,6,>16,22,18,27]

   4. [2,6,16,>22,18,27]

   5. [2,6,16,18,>22,27]

   6. [2,6,16,18,22,27]
```



###### 2. Big-O Gösteriminin Yazılması

| Time Complexity |
| :-------------: |

|     Algoritma      | Best Case |     Average Case     |      Worst Case      |
| :----------------: | :-------: | :------------------: | :------------------: |
| **Insertion Sort** | **O(n)**  | **O(n<sup>2</sup>)** | **O(n<sup>2</sup>)** |



###### 3. Time Complexity

- Best Case: ***[2,6,16,18,22,27]***
- Average Case: ***[27,22,18,16,6,2]***
- Worst Case: ***[27,22,18,16,6,2]***



###### 4. Dizi sıralandıktan sonra 18 sayısının case'i

- 18'i bulmak için dizinin ilk üç elemanı sorgulanır ve 4. elemanda 18'e ulaşılabilir. Dizinin boyutunu 6 olarak ele alırsak ***Average Case*** olarak adlandırabiliriz.





### *[7,3,5,8,2,9,4,15,6]* dizisinin Insertion Sort'a göre sıralanması



### Cevap



```
   1. [>7,3,5,8,2,9,4,15,6]

   2. [2,>3,5,8,7,9,4,15,6]

   3. [2,3,>5,8,7,9,4,15,6]

   4. [2,3,4,>8,7,9,5,15,6]

   5. [2,3,4,5,>7,9,8,15,6]

   6. [2,3,4,5,6,>9,8,15,7]
   
   7. [2,3,4,5,6,7,>8,15,9]
   
   8. [2,3,4,5,6,7,8,>15,9]
   
   9. [2,3,4,5,6,7,8,9,15]
```
