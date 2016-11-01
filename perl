яяяяяя
262626

my @sieve=2..$n;
while(@sieve and $sieve[0]==0)
{
	shift @sieve;
}
last unless @sieve;
print my $p=shift @sieve, "\n";
for(my $i=$p-1; $i<@sieve; $i+=$p)
{
	$sieve[$i]=0;
}





@state=(1..100);
for ($i=0; $i<100; $i++) {
	for($j=0; $j<100; $j++) {
	if ($state[$i] !=0 && $state[$j] % $state[$j])
} else { delete($state[$j])
}


print ("What is your name?\n");
$name = <STDIN>;
print ("Hello, $name\n");

$guess = <STDIN>;

DZ №2 с do-while
