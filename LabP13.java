public class LabP13
{
String names[];
int length;
public static void main(String[] args) 
{
LabP13 obj = new LabP13();
String stringsList[] = {"raja", "goutham", "rani", "gouthami", "honey", "aryan", 
"ayaan"};
obj.sort(stringsList);
for (String i : stringsList) 
{
 System.out.print(i);
 System.out.print(" ");
}
}
void sort(String array[]) {
 if (array == null || array.length == 0) {
  return;
}
 names = array;
 length = array.length;
 quickSort(0, length - 1);
}
void quickSort(int lowerIndex, int higherIndex) {
int i = lowerIndex;
int j = higherIndex;
String pivot = names[lowerIndex + (higherIndex - lowerIndex) / 2];
while (i <= j) 
{
while (names[i].compareToIgnoreCase(pivot) < 0) 
{
i++;
}
while (names[j].compareToIgnoreCase(pivot) > 0)
{
j--;
}
if (i <= j) 
{
exchangeNames(i, j);
i++;
j--;
}
}
if (lowerIndex < j) 
{
quickSort(lowerIndex, j);
}
if (i < higherIndex) 
{
quickSort(i, higherIndex);
}
}
void exchangeNames(int i, int j) 
{
String temp = names[i];
names[i] = names[j];
names[j] = temp;
}
}
