# TEMA 3-4

VER ORDENAR DE MAYOR A MENOR

### Insertar un nuevo elemento en su posición (se insertará en orden, sin usar
el algoritmo de la ordenación).

System.out.print("Numero:");
int elemento=sc.nextInt();
if(nElementos<=0) {
arr[0]=elemento;
nElementos++;
}else {
int i;
for(i=nElementos-1;i>=0 && arr[i]>elemento;i--) {
arr[i+1]=arr[i];//movemos 1 en adelante
}
arr[i+1]=elemento;
nElementos++;

```
				 }

```

### INSERTAR AL PRINCIPIO

static int insPrincipio(int[]v,int nElementos) {
if(nElementos>=10) {
System.out.println("El vector ya esta lleno");
}else {
System.out.print("Dime un elemento:");
int elemento=sc.nextInt();
for(int i=nElementos-1;i>=0;i--) {
v[i+1]=v[i];
}
v[0]=elemento;
nElementos++;
}

### INSERTAR AL FINAL

static int insFinal(int[]v,int nElementos) {
if(nElementos>=10) {
System.out.println("El vector ya esta lleno");
}else {
System.out.print("Dime un elemento:");
int elemento=sc.nextInt();
v[nElementos]=elemento;
nElementos++;
}

### INSERTAR EN UNA POS CUALQUIERA

static int insPos(int[]v,int nElementos) {
if(nElementos>=10) {
System.out.println("El vector ya esta lleno");
}else {
System.out.print("Dime un elemento:");
int elemento=sc.nextInt();
System.out.print("Posicion donde quieres insertarlo");
int pos=sc.nextInt();
if(pos>nElementos) {
System.out.println("La posicion es mayor que el numero de elementos");
}else {

```
			for(int i=nElementos;i>=pos;i--) {
				v[i+1]=v[i];
			}
			v[pos]=elemento;
			nElementos++;
		}

	}

```

### ELIMINAR AL PRINCIPIO

static int rmPrincipio(int []v,int nElementos) {
if(nElementos<=0) {
System.out.println("El vector ya esta vacio");
}else {
for(int i=0;i<nElementos;i++) {
v[i]=v[i+1];
}
nElementos--;
}

### ELIMINAR AL FINAL

static int rmFinal(int []v,int nElementos) {
if(nElementos<=0) {
System.out.println("El vector ya esta vacio");
}else {
nElementos--;
}

### ELIMINAR EN UNA POS CUALQUIERA

static int rmPos(int []v,int nElementos) {
if(nElementos<=0) {
System.out.println("El vector ya esta vacio");
}else {

```
		System.out.print("Posicion donde quieres eliminar");
		int pos=sc.nextInt();

		for(int i=pos;i<nElementos-1;i++) {
			v[i]=v[i+1];
		}
		nElementos--;
	}

```

### MODIFICAR

static void mod(int []v,int nElementos) {
System.out.print("Posicion:");
int pos=sc.nextInt();
if(pos>nElementos-1 || pos<0) {
System.out.println("Posicion no valida");
}else {
System.out.print("Nuevo elemento:");
int elem=sc.nextInt();
v[pos]=elem;
}
}

### BUSCAR POR VALOR(VECTOR SIN ORDENAR)—>BUSQSECUENCIAL

static void busqSec(int[]v,int nElementos) {
// VECTOR NO ORDENADO

```
	System.out.print("Elemento que quieres buscar");
	int valor=sc.nextInt();

    boolean encontrado = false;
    for (int i = 0; i < nElementos && !encontrado; i++) {
        if (v[i] == valor) {
            encontrado = true;
        }
    }

    if (encontrado) {
        System.out.println("El elemento esta en la lista.");
    } else {
        System.out.println("El elemento no esta en la lista.");
    }
}

```

### BUSCAR POR VALOR(VECTOR ORDENADO)—>BUSQBINARIA

static void busqBin(int[]v,int nElementos) {
//VECTOR ORDENADO
int resultado = -1;
int limiteInferior = 0;
int limiteSuperior = nElementos - 1;
int indice;

```
    System.out.print("Elemento que quieres buscar:");
    int valor=sc.nextInt();

    boolean encontrado=false;
    while (limiteInferior <= limiteSuperior && !encontrado) {
        indice = (limiteInferior + limiteSuperior) / 2;

        if (v[indice] == valor) {
        	encontrado=true;
        }else if (valor > v[indice]) {
            limiteInferior = indice + 1;
        }else if (valor < v[indice]) {
            limiteSuperior = indice - 1;
        }
    }

    if (encontrado) {
        System.out.println("El elemento esta en la lista.");
    } else {
        System.out.println("El elemento no esta en la lista.");
    }
}

```

### BUSCAR POR POSICIÓN

static void busqPos(int[]v,int nElementos) {
System.out.print("Dime la posicion que quieres buscar:");
int pos=sc.nextInt();
if(pos>nElementos) {
System.out.println("Posicion no valida");
}else {
System.out.println("El elemento de la posicion "+pos+" es "+v[pos]);
}
}

### ORDENAR—>MÉTODO DE LA BURBUJA

static void burb(int[]v,int nElementos) {
System.out.print("Vector sin ordenar: ");
for(int i=0;i<nElementos;i++){
System.out.print(v[i]+" ");
}
//Ordenamiento
for(int i=0; i < nElementos-1; i++){
for(int j=0; j < (nElementos-1-i); j++){

if(v[j] > v[j+1]){

int aux=v[j];

v[j]=v[j+1];

v[j+1]=aux;
}

}
}
System.out.print("\nVector ordenado: ");
for(int i=0;i<nElementos;i++){
System.out.print(v[i]+" ");
}
System.out.println();
}

### DESPLAZAR(EJ 4 DEL AÑO PASADO)

static void desplazar(int[]v,int nPosiciones) {
int aux[]=new int[v.length];
//lo copio
for(int i=v.length-1;i>=0;i--) {
aux[i]=v[i];
}

```
	for(int i=0;i<aux.length;i++) {
		if(i+nPosiciones<=aux.length-1) {
			v[i+nPosiciones]=aux[i];
		}else {
			v[(i+nPosiciones)%aux.length]=aux[i];
		}
	}
}

```