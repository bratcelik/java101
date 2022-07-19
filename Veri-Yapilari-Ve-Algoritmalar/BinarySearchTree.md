# Binary Search Tree Projesi



## Proje 3



### *[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]* -> Binary-Search-Tree aşamalarını yazınız.

***



### Cevap

###### *[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]* dizisinin Binary Search Tree ile oluşturulması

**Aşama 1**: Diziyi sırayla okumaya başlarsak ilk eleman 7'dir. Ağaç yeni oluşacağından 7 kök düğüm olur.

``````
												   >7<
												  /   \
``````

**Aşama 2**: Sıradaki elemanımız 5'tir. Kök düğüme bakıyoruz. "5 < 7" olduğundan ağacın soluna bakıyoruz ve düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												  /   \
											    >5<
											   /   \
``````

**Aşama 3**: Sıradaki elemanımız 1'dir. Kök düğüme bakıyoruz. "1 < 7" olduğundan ağacın soluna bakıyoruz ve "1 < 5" olduğundan tekrar sola bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												  /   \
												 5
											   /   \
											 >1<
										    /   \
``````

**Aşama 4**: Sıradaki elemanımız 8'dir. Kök düğüme bakıyoruz. "8 > 7" olduğundan ağacın sağına bakıyoruz ve düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5      >8<
											  /   \    / \
											 1    
										    / \
``````

**Aşama 5**: Sıradaki elemanımız 3'tür. Kök düğüme bakıyoruz. "3 < 7" olduğundan ağacın soluna bakıyoruz ve "3 < 5" olduğundan tekrar sola bakıyoruz. "3 > 1" olduğundan ağacın sağına bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5       8
											  /   \    /  \
											 1     
										    / \
										      >3<
										      / \
``````

**Aşama 6**: Sıradaki elemanımız 6'dır. Kök düğüme bakıyoruz. "6 < 7" olduğundan ağacın soluna bakıyoruz ve "6 > 5" olduğundan ağacın sağına bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5       8
											  /   \    /  \
											1     >6<
										   / \    / \
										      3
										     / \
``````

**Aşama 7**: Sıradaki elemanımız 0'dır. Kök düğüme bakıyoruz. "0 < 7" olduğundan ağacın soluna bakıyoruz ve "0 < 5" olduğundan ağacın soluna bakıyoruz. Burada da "0 < 1" olduğundan tekrardan ağacın soluna bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5       8
											  /   \    /  \
											1      6
										   / \    / \
										 >0<  3
										 / \ / \
``````

**Aşama 8**: Sıradaki elemanımız 9'dur. Kök düğüme bakıyoruz. "9 > 7" olduğundan ağacın sağına bakıyoruz ve "9 > 8" olduğundan tekrar ağacın sağına bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5       8
											  /   \    /  \
											1      6`     >9<
										   / \    / \     / \
										  0   3
										 / \ / \
``````

 **Aşama 8**: Sıradaki elemanımız 4'tür. Kök düğüme bakıyoruz. "4 < 7" olduğundan ağacın soluna bakıyoruz ve "4 < 5" olduğundan ağacın soluna bakıyoruz. Burada "4 > 1" olduğundan ağacın sağına bakıyoruz ve "4 > 3" olduğundan tekrar ağacın sağına bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5       8
											  /   \    /  \
											1      6`      9
										   / \    / \     / \
										  0   3
										 / \ / \
										       >4<
``````

 **Aşama 8**: Sıradaki elemanımız 2'dir. Kök düğüme bakıyoruz. "2 < 7" olduğundan ağacın soluna bakıyoruz ve "2 < 5" olduğundan ağacın soluna bakıyoruz. Burada "2 > 1" olduğundan ağacın sağına bakıyoruz ve "2 < 3" olduğundan ağacın soluna bakıyoruz. Bu düğüm boş olduğundan değeri buraya ekliyoruz.

``````
													7
												 /     \
												5       8
											  /   \    /  \
											1      6`      9
										  /  \    / \     / \
										 0    3
								        /\   / \
										   >2<  4
``````

##### Ağacın son durumu

``````
													7
												 /     \
												5       8
											  /   \    /  \
											1      6`      9
										  /  \    / \     / \
										 0    3
								        /\   / \
										   >2<  4
``````





