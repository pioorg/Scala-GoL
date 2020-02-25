/*
 *  Copyright (C) 2020 Piotr Przybył
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

class ScalaUnitSpec2TinySample extends org.specs2.mutable.Specification {
  "two must" >> {
    "be less than 3" >> {
      2 must be_< (3)
    }
    "be more than one" >> {
      2 must be_> (1)
    }
  }
}

class ScalaTextSpec2TinySample extends org.specs2.Specification { def is = s2"""
  This is specification of 2

  Two should
    be less than four     $e1
    be more than zero     $e2
"""
  private def e1 = 2 must beLessThan(4)
  private def e2 = 2 must beGreaterThan(0)
}