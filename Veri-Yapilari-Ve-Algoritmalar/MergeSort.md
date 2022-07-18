# Merge Sort Projesi



## Proje 2

### *[16,21,11,8,12,22]* -> Merge Sort

1. Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
2. Big-O gösterimini yazınız.

***



### Cevap



###### 1. ***[16,21,11,8,12,22]*** dizisinin Merge Sort'a göre sıralanması 

**Aşama 1**: Diziyi mümkün olduğunca eşit şekilde ikiye bölüyoruz.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				  [16, 21, 11]    [8, 12, 22]
```

**Aşama 2**: Sol alt diziyi mümkün olduğunca eşit şekilde ikiye bölüyoruz.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				  [16, 21, 11]    [8, 12, 22]
	  				     /     \
	  				 [16,21]   [11]  
```

**Aşama 3**: Sol alt diziyi mümkün olduğunca eşit şekilde bölüyoruz.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				  [16, 21, 11]    [8, 12, 22]
	  				     /     \
	  				 [16,21]   [11]
	  				  /   \
	  			    [16]  [21]
```

**Aşama 4**: Gelinen noktada en alt dizilerde uzunluk 1'dir. Bölünme olmayacağından kardeş dizileri üst diziye sıralı olarak birleştiriyoruz. 16 < 21 olduğundan 16 ilk indise, 21 ikinci indise gelir.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				  [16, 21, 11]    [8, 12, 22]
	  				     /     \
	  				 [16,21]   [11]
	  				  /    \
	  				 ^	    ^
	  			  >[16]<  >[21]<
```

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				  [16, 21, 11]    [8, 12, 22]
	  				     /     \
	  			    >[16,21]<  [11]
```

**Aşama 5**: Gelinen noktada sol alt dizinin biri tamalandı ve içinde 11 olan dizi artık bölünemeyeceğinden kardeş dizileri üst diziye sıralı olarak birleştiriyoruz. 11 < 16 < 21 olduğundan diziye bu sırayla yerleşir.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				  [16, 21, 11]    [8, 12, 22]
	  				     /     \
	  				    ^       ^
	  			    >[16,21]< >[11]<
```

``````
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<    [8, 12, 22]
``````

**Aşama 6**: Sol alt ağaç sıralı bir şekilde birleşti ve sağ alt ağacımı mümkün olduğunca eşit olarak ikiye bölüyoruz.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<    [8, 12, 22]
	  									/     \
	  								 [8,12]   [22]
```

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<    [8, 12, 22]
	  									/     \
	  								 [8,12]   [22]
	  								 /   \
	  							   [8]   [12]
```

**Aşama 7**: Alt ağaçlar artık bölünemeyeceğinden kardeş dizileri üst dizide birleştiriyoruz. 8 < 12 olduğundan üst dizide bu sırayla birleşirler.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<    [8, 12, 22]
	  									/     \
	  								 [8,12]   [22]
	  								 /   \
	  								^     ^
	  							  >[8]< >[12]<
```

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<    [8, 12, 22]
	  									/     \
	  							    >[8,12]<  [22]
```

**Aşama 8**: Gelinen noktada alt dizilerden biri sıralı ve diğeride bölünemeyeceğinden kardeş dizileri üst dizide birleştiriyoruz. 8 < 12 < 22 olduğundan üst dizide bu sırayla birleşirler.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<    [8, 12, 22]
	  									/     \
	  								   ^       ^
	  							    >[8,12]< >[22]<
```

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
	  				>[11, 16, 21]<   >[8, 12, 22]<
```

**Aşama 9**: Son olarak sıralanmış iki alt dizimiz var. Bu kardeş dizileri üst dizide birleştiriyoruz. 8 < 11 < 12 < 16 < 21 < 22 olduğundan üst dizide bu sırayla birleşirler ve dizimiz artık sıralanmıştır.

```
						[16, 21, 11, 8, 12, 22]
      						/			  \
      					   ^               ^
	  				>[11, 16, 21]<   >[8, 12, 22]<
```

```
						[8, 11, 12, 16, 21, 22]
```



###### 2. Big-O Gösteriminin Yazılması

| Time Complexity |
| :-------------: |

|   Algoritma    |    Best Case    |  Average Case   |   Worst Case    |
| :------------: | :-------------: | :-------------: | :-------------: |
| **Merge Sort** | **O(n log(n))** | **O(n log(n))** | **O(n log(n))** |

