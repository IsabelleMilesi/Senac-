// 1. Números pares de 1 a 10 usando FOR
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}

// 2. Números de 1 a 10 e se é par ou ímpar usando FOR
for (int i = 1; i <= 10; i++) {
    System.out.println(i + (i % 2 == 0 ? " é par" : " é ímpar"));
}

// 3. Tabuada de um número lido na tela usando FOR
Scanner scanner = new Scanner(System.in);
System.out.print("Digite um número: ");
int num = scanner.nextInt();
for (int i = 1; i <= 10; i++) {
    System.out.println(num + " x " + i + " = " + (num * i));
}
scanner.close();

// 4. O dobro de números de 1 a 10 usando FOR (2*i)
for (int i = 1; i <= 10; i++) {
    System.out.println("Dobro de " + i + " é " + (2 * i));
}

// 5. O quadrado dos números de 1 a 10 usando FOR (i*i)
for (int i = 1; i <= 10; i++) {
    System.out.println("Quadrado de " + i + " é " + (i * i));
}

// 6. Contagem regressiva de 10 a 1
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}