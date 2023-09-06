



int Fact(int num){
    if(num == 0){
        return 1;
    }
    return num * Fact(num - 1);
}


int n = int.Parse(Console.ReadLine());
Console.WriteLine(Fact(n));