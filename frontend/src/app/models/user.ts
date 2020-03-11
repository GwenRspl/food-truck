import { Gender } from './gender';
import { Society } from './society';
import { Profile } from './profile';
import { Rating } from './rating';
import { Address } from './address';

export class User {
  id: number;
  name: string;
  firstname: string;
  birthday: string;
  password: string;
  phonenumber: string;
  email: string;
  gender: Gender;
  address: Address[];
  society: Society;
  profile: Profile;
  rating: Rating[];


}
