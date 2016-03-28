#!/usr/bin/perl 

use strict;
use warnings;

my $filename = 'Yourname.txt';

open READ, $filename or die "Cant open";
close READ;

# Convert file into binary code
my $bin = unpack 'B*',$filename; 

my $bin = 'Yourname.bin';

# Display how much file were converted
print "\nRead ", length($bin)/8000000, ' Mbytes'; 

# Save the binary code into txt file
#open(WRITE,">Yourname.txt") or die "\nCan't create txt file";     
#print WRITE "$bin";
#close WRITE;