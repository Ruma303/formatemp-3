# La Classe `Scanner`

La classe **`Scanner`** in Java è una delle classi più utilizzate per leggere l'input da diverse sorgenti, come file, stringhe o direttamente dall'utente tramite la console. Fa parte del pacchetto `java.util` e offre un'interfaccia semplice e potente per analizzare e dividere l'input in **token** (sequenze di caratteri separate da delimitatori, come spazi o newline).

---

## 1. **Importazione della Classe Scanner**

Prima di utilizzare `Scanner`, è necessario importare la classe:

```java
import java.util.Scanner;
```

---

## 2. **Creazione di un Oggetto Scanner**

Un oggetto `Scanner` può essere creato per leggere input da diverse sorgenti. Le sorgenti più comuni sono:

### 2.1 Input da Console (System.in)
Per leggere input dalla tastiera:

```java
Scanner scanner = new Scanner(System.in);
```

**Esempio**:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Inserisci il tuo nome: ");
String nome = scanner.nextLine();
System.out.println("Ciao, " + nome + "!");
```

---

### 2.2 Input da Stringa
Per leggere dati da una stringa:

```java
Scanner scanner = new Scanner("Questa è una stringa di esempio");
```

**Esempio**:

```java
String data = "10 20 30";
Scanner scanner = new Scanner(data);
while (scanner.hasNextInt()) {
    System.out.println(scanner.nextInt());
}
```

---

### 2.3 Input da File
Per leggere dati da un file, è necessario utilizzare un oggetto `File`:

```java
import java.io.File;
import java.util.Scanner;

File file = new File("percorso/del/file.txt");
Scanner scanner = new Scanner(file);
```

**Esempio** (gestione delle eccezioni inclusa):

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiDaFile {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String riga = scanner.nextLine();
                System.out.println(riga);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato!");
        }
    }
}
```

---

## 3. **Metodi Principali della Classe Scanner**

La classe `Scanner` offre una varietà di metodi per leggere diversi tipi di dati. Di seguito, i metodi più comuni:

### 3.1 Lettura di Stringhe
- **`next()`**: Legge il prossimo token (fino al prossimo delimitatore, di default uno spazio).
- **`nextLine()`**: Legge l'intera riga di input, inclusi spazi.

**Esempio**:

```java
Scanner scanner = new Scanner(System.in);

// next()
System.out.print("Inserisci una parola: ");
String parola = scanner.next();
System.out.println("Hai inserito: " + parola);

// nextLine()
scanner.nextLine(); // Necessario per consumare il newline
System.out.print("Inserisci una frase: ");
String frase = scanner.nextLine();
System.out.println("Hai inserito: " + frase);
```

**Nota:** Quando si utilizza `nextLine()` dopo un metodo come `next()`, potrebbe essere necessario consumare il carattere **`\n`** rimasto nel buffer.

---

### 3.2 Lettura di Numeri
- **`nextInt()`**: Legge un numero intero.
- **`nextDouble()`**: Legge un numero in virgola mobile (tipo `double`).
- **`nextLong()`**: Legge un valore `long`.
- **`nextFloat()`**: Legge un valore `float`.
- **`nextShort()`**: Legge un valore `short`.

**Esempio**:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Inserisci un numero intero: ");
int numero = scanner.nextInt();
System.out.println("Hai inserito: " + numero);

System.out.print("Inserisci un numero decimale: ");
double decimale = scanner.nextDouble();
System.out.println("Hai inserito: " + decimale);
```

---

### 3.3 Controllo della Disponibilità di Input
Prima di leggere un valore, è possibile verificare se è disponibile un dato specifico utilizzando i metodi `hasNextXXX()`:

- **`hasNextInt()`**: Verifica se il prossimo token è un intero.
- **`hasNextDouble()`**: Verifica se il prossimo token è un numero in virgola mobile.
- **`hasNext()`**: Verifica se è disponibile un altro token.
- **`hasNextLine()`**: Verifica se c'è un'altra riga di input.

**Esempio**:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Inserisci un numero: ");
if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
    System.out.println("Hai inserito: " + numero);
} else {
    System.out.println("Non hai inserito un numero valido!");
}
```

---

### 3.4 Personalizzazione del Delimitatore
Il delimitatore predefinito usato dal `Scanner` per separare i token è uno spazio bianco (`\s`, che include spazi, tabulazioni e newline). È possibile modificare questo comportamento utilizzando il metodo `useDelimiter()`.

**Esempio**:

```java
String data = "10,20,30,40";
Scanner scanner = new Scanner(data);
scanner.useDelimiter(",");

while (scanner.hasNextInt()) {
    System.out.println(scanner.nextInt());
}
```

---

## 4. **Gestione delle Eccezioni**

La classe `Scanner` può generare diverse eccezioni, tra cui le più comuni sono:

- **`InputMismatchException`**: Sollevata quando il tipo di dato fornito non corrisponde a quello richiesto.
- **`NoSuchElementException`**: Sollevata se non ci sono più token disponibili.
- **`IllegalStateException`**: Sollevata se il metodo viene chiamato su uno scanner chiuso.

**Esempio di gestione di eccezioni**:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestioneEccezioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt();
            System.out.println("Hai inserito: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Errore: non hai inserito un numero valido!");
        } finally {
            scanner.close(); // Chiudere lo scanner per liberare risorse
        }
    }
}
```

---

## 5. **Chiusura dello Scanner**

È importante chiudere lo scanner una volta terminato l'uso, specialmente se si legge da risorse come file o `System.in`. Questo può essere fatto con il metodo `close()`:

```java
Scanner scanner = new Scanner(System.in);
// Operazioni con scanner
scanner.close();
```

**Nota:** Non è strettamente necessario chiudere lo scanner quando si utilizza `System.in`, ma è considerata una buona pratica per evitare **memory leaks**.

---

## 6. **Problematiche Comuni**

1. **Buffer non consumato:** Quando si utilizza `nextLine()` dopo altri metodi (`nextInt()`, `nextDouble()`, ecc.), il newline residuo nel buffer può causare comportamenti inaspettati.
   - **Soluzione:** Utilizzare un `scanner.nextLine()` aggiuntivo per consumare il newline prima di leggere una stringa.

2. **Eccezioni per dati non validi:** Usare sempre i metodi `hasNextXXX()` per verificare la presenza di un token valido prima di leggerlo.

3. **Scanner condiviso:** Non utilizzare lo stesso scanner per leggere da diverse sorgenti (es. file e console), poiché potrebbe risultare in comportamenti non prevedibili.

---

## 7. **Spunti di Riflessione**

- La classe `Scanner` è comoda per applicazioni semplici, ma per grandi quantità di dati o input complessi, potrebbe non essere la scelta più efficiente. In questi casi, si possono valutare classi come **`BufferedReader`** o librerie esterne per la gestione dell'input.
- La personalizzazione del delimitatore consente di analizzare facilmente formati di dati complessi (es. CSV o file personalizzati).
- È possibile combinare `Scanner` con altre funzionalità, come `Regex`, per realizzare analisi più avanzate dell'input.