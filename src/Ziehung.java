public class Ziehung {
    private Urne dieUrne;
    private int[] lottozahlen;
    private int zusatzzahl;

    public Ziehung() {
        dieUrne = new Urne();
        lottozahlen = new int[6];
        ziehen();
        sortieren(lottozahlen);
    }

    private void sortieren(int[] inputArray) {
        int arrayLength = inputArray.length;
    
        if (inputArray.length < 2) {
            return;
        }
    
        int midIndex = inputArray.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrayLength - midIndex];
    
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = inputArray[i]; //fill the leftHalf Array with the first numbers from the input Array
            
        }
        for (int i = midIndex; i < arrayLength; i++) {
            rightArray[i - midIndex] = inputArray[i]; //fill the rightHalf Array with the last numbers from the input Array
        }

        sortieren(leftArray);
        sortieren(rightArray);
    
        merge(inputArray, leftArray, rightArray);
    }
    
    private void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArraySize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArraySize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void ziehen() {
        for (int i = 0; i < lottozahlen.length; i++) {
            lottozahlen[i] = dieUrne.ziehen().getZahl();
        }
        zusatzzahl = dieUrne.ziehen().getZahl();
    }

    public int getLottozahl(int nr) {
        return lottozahlen[nr];
    }

    public int getZusatzzahl() {
        return zusatzzahl;
    }
}