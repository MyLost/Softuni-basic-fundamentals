package fundamentals.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();
		String command = scanner.nextLine();
		while(!command.equals("end")) {

			String[] commands = command.split(" "); 
			if(commands[0].equals("exchange")) {
				if(Integer.parseInt(commands[1]) >= 0 && Integer.parseInt(commands[1]) <= numbers.length-1) {
					int[] result = exchange(Integer.parseInt(commands[1]), numbers);
					numbers=result;
				} else {
					System.out.println("Invalid index");
				}
			} else if (commands[0].equals("max")) {
				if(commands[1].equals("even")) {
					int result = maxEven(numbers);
					System.out.println(result == Integer.MIN_VALUE ? "No matches" : result);
				} else {
					int result = maxOdd(numbers);
					System.out.println(result == Integer.MIN_VALUE ? "No matches" : result);
				}
			} else if (commands[0].equals("min")) {
				if(commands[1].equals("even")) {
					int result = minEven(numbers);
					System.out.println(result == Integer.MAX_VALUE ? "No matches" : result);
				} else {
					int result = minOdd(numbers);
					System.out.println(result == Integer.MAX_VALUE ? "No matches" : result);
				}
			} else if (commands[0].equals("first")) {
				if(commands[2].equals("even")) {
					if(Integer.parseInt(commands[1]) > numbers.length) {
						System.out.println("Invalid count");
					} else {
						if(Integer.parseInt(commands[1]) > 0) {
							int[] result = firstEven(Integer.parseInt(commands[1]), numbers);
							System.out.println(result == null ? "[]" : Arrays.toString(removeZerosFromArray(Arrays.stream( result ).boxed().toArray( Integer[]::new ))));
						}
					}
				} else {
					if(Integer.parseInt(commands[1]) > numbers.length) {
						System.out.println("Invalid count");
					} else {
						if(Integer.parseInt(commands[1]) > 0) {
							int[] result = firstOdd(Integer.parseInt(commands[1]), numbers);
							System.out.println(result == null ? "[]" : Arrays.toString(removeZerosFromArray(Arrays.stream( result ).boxed().toArray( Integer[]::new ))));
						}
					}
				}
			} else if (commands[0].equals("last")) {
				if(commands[2].equals("even")) {
					if(Integer.parseInt(commands[1]) > numbers.length) {
						System.out.println("Invalid count");
					} else {
						if(Integer.parseInt(commands[1]) > 0) {
							int[] result = lastEven(Integer.parseInt(commands[1]), numbers);
							System.out.println(result == null ? "[]" : Arrays.toString(removeZerosFromArray(Arrays.stream( result ).boxed().toArray( Integer[]::new ))));
						}
					}
				} else {
					if(Integer.parseInt(commands[1]) > numbers.length) {
						System.out.println("Invalid count");
					} else {
						if(Integer.parseInt(commands[1]) > 0) {
							int[] result = lastOdd(Integer.parseInt(commands[1]), numbers);
							System.out.println(result == null ? "[]" : Arrays.toString(removeZerosFromArray(Arrays.stream( result ).boxed().toArray( Integer[]::new ))));
						}
					}
				}
			}
			command = scanner.nextLine();
		}
			System.out.print(Arrays.toString(numbers));
	}
	
	private static int[] exchange(int index, int[] array) {
		if(index != 0) {
			int[] partialArray = Arrays.stream(array).skip(index + 1).toArray();
			int[] numbers = new int[array.length];
			for (int i = 0; i < partialArray.length; i++) {
				numbers[i] = partialArray[i];
			}
			int count =0;
			for (int i = partialArray.length; count < index + 1; i++) {
				numbers[i] = array[count];
				count++;
			}
			return numbers;
		} 
		return array;
	}

	private static int maxEven(int[] array) {
		int maxEventNumber = Integer.MIN_VALUE;
		int index = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				if(array[i] >= maxEventNumber) {
					maxEventNumber = array[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	private static int maxOdd(int[] array) {
		int maxOddNumber = Integer.MIN_VALUE;
		int index = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				if(array[i] >= maxOddNumber) {
					maxOddNumber = array[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	private static int minEven(int[] array) {
		int minEventNumber = Integer.MAX_VALUE;
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 ==0) {
				if(array[i] <= minEventNumber) {
					minEventNumber = array[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	private static int minOdd(int[] array) {
		int minOddNumber = Integer.MAX_VALUE;
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 !=0) {
				if(array[i] <= minOddNumber) {
					minOddNumber = array[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	private static int[] firstEven(int size, int[] array) {
		int[] firstCountEven = new int[size];
		int count =0;
		boolean evenFlag = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 ==0) {
				if(count < size) {
					firstCountEven[count] = array[i];
					count++;
					evenFlag = true;
				}
			}
		}
		if(evenFlag) {
			return firstCountEven;
		}else {
			return null;
		}
	}
	
	private static int[] firstOdd(int size, int[] array) {
		int[] firstCountOdd = new int[size];
		boolean oddFlag = false;
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 !=0) {
				if(count < size) {
					oddFlag = true;
					firstCountOdd[count] = array[i];
					count++;
				}
			}
		}
		if(oddFlag) {
			return firstCountOdd;
		} else {
			return null;
		}
	}
	
	private static int[] lastEven(int size, int[] array) {
		int[] lastCountEven = new int[size];
		boolean evenFlag = false;
		int count = 0;
		for (int i = array.length-1; i >= 0; i--) {
			if(array[i] % 2 == 0) {
				if(count < size) {
					lastCountEven[count] = array[i];
					count++;
					evenFlag = true;
				}
			}
		}
		if(evenFlag) {
			return reverse(lastCountEven);
		}else {
			return null;
		}
	}
	
	private static int[] lastOdd(int size, int[] array) {
		int[] lastCountOdd = new int[size];
		int count = 0;
		boolean oddFlag = false;
		for (int i = array.length-1; i >= 0; i--) {
			if(array[i] % 2 != 0) {
				if(count < size) {
					oddFlag = true;
					lastCountOdd[count] = array[i];
					count++;
				}
			}
		}
		if(oddFlag) {
			return reverse(lastCountOdd);
		}else {
			return null;
		}
	}
	
	private static Integer[] removeZerosFromArray(Integer[] array) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.removeAll(Arrays.asList(Integer.valueOf(0)));
		return list.toArray(new Integer[list.size()]);
	}
	
	private static int[] reverse(int[] array) {
		int[] b = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            b[j - 1] = array[i];
            j = j - 1;
        }
        return b;
	}
}
