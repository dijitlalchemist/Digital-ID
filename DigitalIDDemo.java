/**
	 * Digital ID by Gary Krisjon Wetter
	 * Copyright (c), Gary Krisjon Wetter. All Rights Reserved.
	 * 
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 *
	 *   - Redistributions of source code must retain the above copyright
	 *     notice, this list of conditions and the following disclaimer.
	 *
	 *   - Redistributions in binary form must reproduce the above copyright
	 *     notice, this list of conditions and the following disclaimer in the
	 *     documentation and/or other materials provided with the distribution.
	 *
	 *   - Neither the name of Gary Krisjon Wetter or the names of its
	 *     contributors may be used to endorse or promote products derived
	 *     from this software without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
	 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
	 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
	 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
	 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
	 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
	 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
	 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
	 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
	 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
	 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
	 * 
	 * @author Gary Krisjon Wetter
	 * @version 1.0
	 * @since 1.0
	 * 
	 */

package system;

public class DigitalIDDemo {
public static void main(String[] args ) {
		
		DigitalID subject = new DigitalID();
		
		subject.date = "10/22/26";
		subject.firstName = "Gary";
		subject.lastName= "Wetter";
		subject.address = "306 Candle Lake Drive";
		subject.driversLicesne = "W2881 27472 09785";
		subject.passport = "NA";
		subject.education = "AAS COMPUTER INFORMATION SYSTEMS";
		subject.state = "NEW JERSEY";
		subject.zipCode = "08087";
		subject.email = "krisjongreay@gmail.com";
		subject.socialMedia = "@lectersmarket";
		
		subject.printStates();
		
	}
}
