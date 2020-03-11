import { Profiler } from 'inspector';
import { Gender } from './gender';
import { Address } from 'cluster';
import { Society } from './society';
import { Profile } from './profile';
import { Rating } from './rating';

export class User{
  id: number;
  name: string;
  firstname: string;
  birthday: string;
  password: string;
  phonenumber: string;
  email: string;
  gender: Gender;
  address : Address[];
  society: Society;
  profile: Profile;
  rating: Rating[];


}
