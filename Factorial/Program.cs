



int Fact(int num){
    int factorial = 1;
    int i = 1;
    while(i <= num){
        factorial *= i;
        i++;
    }
    return factorial;
}


int n = int.Parse(Console.ReadLine());
Console.WriteLine(Fact(n));