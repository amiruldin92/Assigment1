#!/usr/bin/perl 

use strict;
use warnings;

my $filename = 'Yourname.txt';
my $bin = 'Yourname.bin';


# Save the binary code into txt file
open(WRITE,">Yourname.txt") or die "\nCan't create txt file";     
print WRITE "$bin";
close WRITE;