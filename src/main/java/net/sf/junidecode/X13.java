/*
 * Copyright (c) 2009, Giuseppe Cardone
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of the author nor the names of the contributors may be
 *    used to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY GIUSEPPE CARDONE ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL GIUSEPPE CARDONE BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package net.sf.junidecode;

/**
 * Character map for Unicode characters with codepoint U+13xx.
 * @author Giuseppe Cardone
 * @version 0.1
 */
class X13 {

    public static final String[] map = new String[]{
        "ja", // 0x00
        "ju", // 0x01
        "ji", // 0x02
        "jaa", // 0x03
        "jee", // 0x04
        "je", // 0x05
        "jo", // 0x06
        "jwa", // 0x07
        "ga", // 0x08
        "gu", // 0x09
        "gi", // 0x0a
        "gaa", // 0x0b
        "gee", // 0x0c
        "ge", // 0x0d
        "go", // 0x0e
        "[?]", // 0x0f
        "gwa", // 0x10
        "[?]", // 0x11
        "gwi", // 0x12
        "gwaa", // 0x13
        "gwee", // 0x14
        "gwe", // 0x15
        "[?]", // 0x16
        "[?]", // 0x17
        "gga", // 0x18
        "ggu", // 0x19
        "ggi", // 0x1a
        "ggaa", // 0x1b
        "ggee", // 0x1c
        "gge", // 0x1d
        "ggo", // 0x1e
        "[?]", // 0x1f
        "tha", // 0x20
        "thu", // 0x21
        "thi", // 0x22
        "thaa", // 0x23
        "thee", // 0x24
        "the", // 0x25
        "tho", // 0x26
        "thwa", // 0x27
        "cha", // 0x28
        "chu", // 0x29
        "chi", // 0x2a
        "chaa", // 0x2b
        "chee", // 0x2c
        "che", // 0x2d
        "cho", // 0x2e
        "chwa", // 0x2f
        "pha", // 0x30
        "phu", // 0x31
        "phi", // 0x32
        "phaa", // 0x33
        "phee", // 0x34
        "phe", // 0x35
        "pho", // 0x36
        "phwa", // 0x37
        "tsa", // 0x38
        "tsu", // 0x39
        "tsi", // 0x3a
        "tsaa", // 0x3b
        "tsee", // 0x3c
        "tse", // 0x3d
        "tso", // 0x3e
        "tswa", // 0x3f
        "tza", // 0x40
        "tzu", // 0x41
        "tzi", // 0x42
        "tzaa", // 0x43
        "tzee", // 0x44
        "tze", // 0x45
        "tzo", // 0x46
        "[?]", // 0x47
        "fa", // 0x48
        "fu", // 0x49
        "fi", // 0x4a
        "faa", // 0x4b
        "fee", // 0x4c
        "fe", // 0x4d
        "fo", // 0x4e
        "fwa", // 0x4f
        "pa", // 0x50
        "pu", // 0x51
        "pi", // 0x52
        "paa", // 0x53
        "pee", // 0x54
        "pe", // 0x55
        "po", // 0x56
        "pwa", // 0x57
        "rya", // 0x58
        "mya", // 0x59
        "fya", // 0x5a
        "[?]", // 0x5b
        "[?]", // 0x5c
        "[?]", // 0x5d
        "[?]", // 0x5e
        "[?]", // 0x5f
        "[?]", // 0x60
        " ", // 0x61
        ".", // 0x62
        ",", // 0x63
        ";", // 0x64
        ":", // 0x65
        ":: ", // 0x66
        "?", // 0x67
        "//", // 0x68
        "1", // 0x69
        "2", // 0x6a
        "3", // 0x6b
        "4", // 0x6c
        "5", // 0x6d
        "6", // 0x6e
        "7", // 0x6f
        "8", // 0x70
        "9", // 0x71
        "10+", // 0x72
        "20+", // 0x73
        "30+", // 0x74
        "40+", // 0x75
        "50+", // 0x76
        "60+", // 0x77
        "70+", // 0x78
        "80+", // 0x79
        "90+", // 0x7a
        "100+", // 0x7b
        "10,000+", // 0x7c
        "[?]", // 0x7d
        "[?]", // 0x7e
        "[?]", // 0x7f
        "[?]", // 0x80
        "[?]", // 0x81
        "[?]", // 0x82
        "[?]", // 0x83
        "[?]", // 0x84
        "[?]", // 0x85
        "[?]", // 0x86
        "[?]", // 0x87
        "[?]", // 0x88
        "[?]", // 0x89
        "[?]", // 0x8a
        "[?]", // 0x8b
        "[?]", // 0x8c
        "[?]", // 0x8d
        "[?]", // 0x8e
        "[?]", // 0x8f
        "[?]", // 0x90
        "[?]", // 0x91
        "[?]", // 0x92
        "[?]", // 0x93
        "[?]", // 0x94
        "[?]", // 0x95
        "[?]", // 0x96
        "[?]", // 0x97
        "[?]", // 0x98
        "[?]", // 0x99
        "[?]", // 0x9a
        "[?]", // 0x9b
        "[?]", // 0x9c
        "[?]", // 0x9d
        "[?]", // 0x9e
        "[?]", // 0x9f
        "a", // 0xa0
        "e", // 0xa1
        "i", // 0xa2
        "o", // 0xa3
        "u", // 0xa4
        "v", // 0xa5
        "ga", // 0xa6
        "ka", // 0xa7
        "ge", // 0xa8
        "gi", // 0xa9
        "go", // 0xaa
        "gu", // 0xab
        "gv", // 0xac
        "ha", // 0xad
        "he", // 0xae
        "hi", // 0xaf
        "ho", // 0xb0
        "hu", // 0xb1
        "hv", // 0xb2
        "la", // 0xb3
        "le", // 0xb4
        "li", // 0xb5
        "lo", // 0xb6
        "lu", // 0xb7
        "lv", // 0xb8
        "ma", // 0xb9
        "me", // 0xba
        "mi", // 0xbb
        "mo", // 0xbc
        "mu", // 0xbd
        "na", // 0xbe
        "hna", // 0xbf
        "nah", // 0xc0
        "ne", // 0xc1
        "ni", // 0xc2
        "no", // 0xc3
        "nu", // 0xc4
        "nv", // 0xc5
        "qua", // 0xc6
        "que", // 0xc7
        "qui", // 0xc8
        "quo", // 0xc9
        "quu", // 0xca
        "quv", // 0xcb
        "sa", // 0xcc
        "s", // 0xcd
        "se", // 0xce
        "si", // 0xcf
        "so", // 0xd0
        "su", // 0xd1
        "sv", // 0xd2
        "da", // 0xd3
        "ta", // 0xd4
        "de", // 0xd5
        "te", // 0xd6
        "di", // 0xd7
        "ti", // 0xd8
        "do", // 0xd9
        "du", // 0xda
        "dv", // 0xdb
        "dla", // 0xdc
        "tla", // 0xdd
        "tle", // 0xde
        "tli", // 0xdf
        "tlo", // 0xe0
        "tlu", // 0xe1
        "tlv", // 0xe2
        "tsa", // 0xe3
        "tse", // 0xe4
        "tsi", // 0xe5
        "tso", // 0xe6
        "tsu", // 0xe7
        "tsv", // 0xe8
        "wa", // 0xe9
        "we", // 0xea
        "wi", // 0xeb
        "wo", // 0xec
        "wu", // 0xed
        "wv", // 0xee
        "ya", // 0xef
        "ye", // 0xf0
        "yi", // 0xf1
        "yo", // 0xf2
        "yu", // 0xf3
        "yv", // 0xf4
        "[?]", // 0xf5
        "[?]", // 0xf6
        "[?]", // 0xf7
        "[?]", // 0xf8
        "[?]", // 0xf9
        "[?]", // 0xfa
        "[?]", // 0xfb
        "[?]", // 0xfc
        "[?]", // 0xfd
        "[?]" // 0xfe
    };
}
