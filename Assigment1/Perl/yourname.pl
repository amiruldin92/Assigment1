#! /usr/bin/perl

use strict;
use warnings;
 
my $filename = 'Yourname.txt';
open(my $fh, '>', $filename) or die "Could not open file '$filename' $!";

print "Input Name:\n";
my $name = <STDIN>;
print "Your name: $name";

print "Input Address:\n";
my $address = <STDIN>;
print "Your Address: $address";

close $fh;
print "Hi $name,how is the weather at $address ?";