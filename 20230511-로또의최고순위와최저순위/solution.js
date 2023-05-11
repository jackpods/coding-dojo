// eslint-disable-next-line camelcase, no-unused-vars
function solution(lottos, win_nums) {
  let answer = [];

  const correct = lottos.filter((lotto) => win_nums.includes(lotto)).length;

  const zeros = lottos.filter((lotto) => lotto === 0).length;

  const max = 7 - correct >= 6 ? 6 : 7 - correct;
  const min = max - zeros < 1 ? 1 : max - zeros;

  answer = [min, max];
  return answer;
}
